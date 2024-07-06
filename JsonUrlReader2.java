package org.apache.beam.examples;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class JsonUrlReader2 {

    public JsonUrlReader2() {
    }

    public List<Transporte> cargarURL() throws StreamReadException, DatabindException, MalformedURLException, IOException {
        Map<String, String[]> operadores = Map.of(
                "Buses Vule S.A.", new String[]{"111", "113", "113c", "113e", "119", "121", "125", "126"},
                "Voy Santiago SPA", new String[]{"101", "101c", "103", "106", "107", "107c", "107cy", "108", "117", "117c"},
                "Buses Metropolitana S.A.", new String[]{"109", "109N", "110", "110c", "115", "115y", "118", "408", "408e"},
                "Redbus Urbano S. A.", new String[]{"105", "116", "120", "410", "410e", "410y"},
                "STP Santiago S.A.", new String[]{"102", "104", "112N", "114"}
        );

        List<Transporte> transportes = new ArrayList<>();

        ObjectMapper mapper = new ObjectMapper();

        for (Map.Entry<String, String[]> operador : operadores.entrySet()) {
            String operadorNombre = operador.getKey();
            String[] codigos = operador.getValue();

            for (String codigo : codigos) {
                String apiUrl = String.format("https://www.red.cl/restservice_v2/rest/conocerecorrido?codsint=%s", codigo);
                try {
                    JsonNode node = mapper.readTree(new URL(apiUrl));

                    Iterator<JsonNode> it = node.elements();
                    while (it.hasNext()) {
                        JsonNode n = it.next();

                        Transporte t = new Transporte();
                        t.setNegocio_nombre(operadorNombre);
                        t.setServicios_cod(codigo);

                        try {
                            t.setHorarios_tipoDia(n.get("horarios_tipoDia").asText());
                            t.setHorarios_inicio(n.get("horarios_inicio").asText());
                            t.setHorarios_fin(n.get("horarios_fin").asText());
                            t.setPath_lat(n.get("path_lat").asDouble());
                            t.setPath_lon(n.get("path_lon").asDouble());
                            t.setParaderos_id(n.get("paraderos_id").asInt());
                            t.setParaderos_cod(n.get("paraderos_cod").asText());
                            t.setParaderos_num(n.get("paraderos_num").asInt());
                            t.setParaderos_name(n.get("paraderos_name").asText());
                            t.setParaderos_comuna(n.get("paraderos_comuna").asText());
                            t.setServicios_id(n.get("servicios_id").asInt());
                            t.setServicios_destino(n.get("servicios_destino").asText());
                            t.setServicios_orden(n.get("servicios_orden").asInt());
                            t.setServicios_color(n.get("servicios_color").asText());
                            t.setServicios_negocio_nombre(operadorNombre);
                            t.setServicios_negocio_color(n.get("servicios_negocio_color").asText());
                            t.setServicios_recorrido_destino(n.get("servicios_recorrido_destino").asText());
                            t.setStop_id(n.get("stop_id").asInt());
                            t.setStop_coordenada_x(n.get("stop_coordenada_x").asDouble());
                            t.setStop_coordenada_y(n.get("stop_coordenada_y").asDouble());
                        } catch (Exception ex) {
                            System.out.println("Error de tupla: " + ex.getMessage());
                            continue;
                        }

                        transportes.add(t);
                    }
                } catch (IOException e) {
                    System.out.println("Error al leer URL: " + e.getMessage());
                }
            }
        }

        return transportes;
    }
}
