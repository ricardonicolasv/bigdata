public class Transporte {
    private int negocio_id;
    private String negocio_nombre;
    private String negocio_color;
    private String negocio_url;
    private int ida_id;
    private String horarios_tipoDia;
    private String horarios_inicio;
    private String horarios_fin;
    private double path_lat;
    private double path_lon;
    private int paraderos_id;
    private String paraderos_cod;
    private int paraderos_num;
    private String paraderos_name;
    private String paraderos_comuna;
    private int servicios_id;
    private String servicios_cod;
    private String servicios_destino;
    private int servicios_orden;
    private String servicios_color;
    private String servicios_negocio_nombre;
    private String servicios_negocio_color;
    private String servicios_recorrido_destino;
    private int stop_id;
    private double stop_coordenada_x;
    private double stop_coordenada_y;

    // Getters
    public int getNegocio_id() {
        return negocio_id;
    }

    public String getNegocio_nombre() {
        return negocio_nombre;
    }

    public String getNegocio_color() {
        return negocio_color;
    }

    public String getNegocio_url() {
        return negocio_url;
    }

    public int getIda_id() {
        return ida_id;
    }

    public String getHorarios_tipoDia() {
        return horarios_tipoDia;
    }

    public String getHorarios_inicio() {
        return horarios_inicio;
    }

    public String getHorarios_fin() {
        return horarios_fin;
    }

    public double getPath_lat() {
        return path_lat;
    }

    public double getPath_lon() {
        return path_lon;
    }

    public int getParaderos_id() {
        return paraderos_id;
    }

    public String getParaderos_cod() {
        return paraderos_cod;
    }

    public int getParaderos_num() {
        return paraderos_num;
    }

    public String getParaderos_name() {
        return paraderos_name;
    }

    public String getParaderos_comuna() {
        return paraderos_comuna;
    }

    public int getServicios_id() {
        return servicios_id;
    }

    public String getServicios_cod() {
        return servicios_cod;
    }

    public String getServicios_destino() {
        return servicios_destino;
    }

    public int getServicios_orden() {
        return servicios_orden;
    }

    public String getServicios_color() {
        return servicios_color;
    }

    public String getServicios_negocio_nombre() {
        return servicios_negocio_nombre;
    }

    public String getServicios_negocio_color() {
        return servicios_negocio_color;
    }

    public String getServicios_recorrido_destino() {
        return servicios_recorrido_destino;
    }

    public int getStop_id() {
        return stop_id;
    }

    public double getStop_coordenada_x() {
        return stop_coordenada_x;
    }

    public double getStop_coordenada_y() {
        return stop_coordenada_y;
    }

    // Setters
    public void setNegocio_id(int negocio_id) {
        this.negocio_id = negocio_id;
    }

    public void setNegocio_nombre(String negocio_nombre) {
        this.negocio_nombre = negocio_nombre;
    }

    public void setNegocio_color(String negocio_color) {
        this.negocio_color = negocio_color;
    }

    public void setNegocio_url(String negocio_url) {
        this.negocio_url = negocio_url;
    }

    public void setIda_id(int ida_id) {
        this.ida_id = ida_id;
    }

    public void setHorarios_tipoDia(String horarios_tipoDia) {
        this.horarios_tipoDia = horarios_tipoDia;
    }

    public void setHorarios_inicio(String horarios_inicio) {
        this.horarios_inicio = horarios_inicio;
    }

    public void setHorarios_fin(String horarios_fin) {
        this.horarios_fin = horarios_fin;
    }

    public void setPath_lat(double path_lat) {
        this.path_lat = path_lat;
    }

    public void setPath_lon(double path_lon) {
        this.path_lon = path_lon;
    }

    public void setParaderos_id(int paraderos_id) {
        this.paraderos_id = paraderos_id;
    }

    public void setParaderos_cod(String paraderos_cod) {
        this.paraderos_cod = paraderos_cod;
    }

    public void setParaderos_num(int paraderos_num) {
        this.paraderos_num = paraderos_num;
    }

    public void setParaderos_name(String paraderos_name) {
        this.paraderos_name = paraderos_name;
    }

    public void setParaderos_comuna(String paraderos_comuna) {
        this.paraderos_comuna = paraderos_comuna;
    }

    public void setServicios_id(int servicios_id) {
        this.servicios_id = servicios_id;
    }

    public void setServicios_cod(String servicios_cod) {
        this.servicios_cod = servicios_cod;
    }

    public void setServicios_destino(String servicios_destino) {
        this.servicios_destino = servicios_destino;
    }

    public void setServicios_orden(int servicios_orden) {
        this.servicios_orden = servicios_orden;
    }

    public void setServicios_color(String servicios_color) {
        this.servicios_color = servicios_color;
    }

    public void setServicios_negocio_nombre(String servicios_negocio_nombre) {
        this.servicios_negocio_nombre = servicios_negocio_nombre;
    }

    public void setServicios_negocio_color(String servicios_negocio_color) {
        this.servicios_negocio_color = servicios_negocio_color;
    }

    public void setServicios_recorrido_destino(String servicios_recorrido_destino) {
        this.servicios_recorrido_destino = servicios_recorrido_destino;
    }

    public void setStop_id(int stop_id) {
        this.stop_id = stop_id;
    }

    public void setStop_coordenada_x(double stop_coordenada_x) {
        this.stop_coordenada_x = stop_coordenada_x;
    }

    public void setStop_coordenada_y(double stop_coordenada_y) {
        this.stop_coordenada_y = stop_coordenada_y;
    }

    @Override
    public String toString() {
        return "Transporte{" +
                "negocio_id=" + negocio_id +
                ", negocio_nombre='" + negocio_nombre + '\'' +
                ", negocio_color='" + negocio_color + '\'' +
                ", negocio_url='" + negocio_url + '\'' +
                ", ida_id=" + ida_id +
                ", horarios_tipoDia='" + horarios_tipoDia + '\'' +
                ", horarios_inicio='" + horarios_inicio + '\'' +
                ", horarios_fin='" + horarios_fin + '\'' +
                ", path_lat=" + path_lat +
                ", path_lon=" + path_lon +
                ", paraderos_id=" + paraderos_id +
                ", paraderos_cod='" + paraderos_cod + '\'' +
                ", paraderos_num=" + paraderos_num +
                ", paraderos_name='" + paraderos_name + '\'' +
                ", paraderos_comuna='" + paraderos_comuna + '\'' +
                ", servicios_id=" + servicios_id +
                ", servicios_cod='" + servicios_cod + '\'' +
                ", servicios_destino='" + servicios_destino + '\'' +
                ", servicios_orden=" + servicios_orden +
                ", servicios_color='" + servicios_color + '\'' +
                ", servicios_negocio_nombre='" + servicios_negocio_nombre + '\'' +
                ", servicios_negocio_color='" + servicios_negocio_color + '\'' +
                ", servicios_recorrido_destino='" + servicios_recorrido_destino + '\'' +
                ", stop_id=" + stop_id +
                ", stop_coordenada_x=" + stop_coordenada_x +
                ", stop_coordenada_y=" + stop_coordenada_y +
                '}';
    }
}
