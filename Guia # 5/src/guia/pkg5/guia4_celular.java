/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5;

/**
 *
 * @author Will Figueroa
 */
public class guia4_celular {

    private double pantalla;
    private int bateria;
    private double precio;
    private int camprincipal;
    private int camsecundaria;
    private String marca;
    private int garantia;
    private int cpu;
    private int ram;
    private int valoracion;
    private boolean flash;

    public guia4_celular() {
        this.valoracion = 0;
    }

    /**
     * @return the pantalla
     */
    public double getPantalla() {
        return pantalla;
    }

    /**
     * @param pantalla the pantalla to set
     */
    public void setPantalla(double pantalla) {
        this.pantalla = pantalla;
    }

    /**
     * @return the bateria
     */
    public int getBateria() {
        return bateria;
    }

    /**
     * @param bateria the bateria to set
     */
    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the pixelaje
     */
    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the garantia
     */
    public int getGarantia() {
        return garantia;
    }

    /**
     * @param garantia the garantia to set
     */
    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    /**
     * @return the cpu
     */
    public int getCpu() {
        return cpu;
    }

    /**
     * @param cpu the cpu to set
     */
    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    /**
     * @return the ram
     */
    public int getRam() {
        return ram;
    }

    /**
     * @param ram the ram to set
     */
    public void setRam(int ram) {
        this.ram = ram;
    }

    /**
     * @return the valoracion
     */
    public int getValoracion() {
        return valoracion;
    }

    /**
     * @param valoracion the valoracion to set
     */
    public void setValoracion(int valoracion) {
        this.valoracion += valoracion;
    }

    public int BateriaPantalla() {
        if (getPantalla() <= 4) {
            if (getBateria() <= 1200) {
                return 3;
            } else if (getBateria() <= 2400) {
                return 4;
            } else if (getBateria() < 3100) {
                return 5;
            } else {
                return 6;
            }
        } else if (getPantalla() <= 5) {
            if (getBateria() <= 1200) {
                return 1;
            } else if (getBateria() >= 2400) {
                return 2;
            } else if (getBateria() < 3100) {
                return 3;
            } else {
                return 4;
            }
        }
        return 0;

    }

    public int mostrar() {
        setValoracion(BateriaPantalla());
        setValoracion(Marca());
        setValoracion(Precio());
        if (isFlash()) {
            setValoracion(Pixelaje() - 1);
        } else {
            setValoracion(Pixelaje());
        }
        setValoracion(Garantia());
        setValoracion(Cpu());
        setValoracion(Ram());
        return getValoracion();

    }

    public int Marca() {
        if (getMarca().compareTo("NEXUS") == 0 || getMarca().compareTo("GOOGLE") == 0 || getMarca().compareTo("LENOVO") == 0 || getMarca().compareTo("HUAWEI") == 0 || getMarca().compareTo("SONY") == 0 || getMarca().compareTo("APPLE") == 0) {
            return 4;

        } else if (getMarca().compareTo("SAMSUNG") == 0 || getMarca().compareTo("ALCATEL") == 0 || getMarca().compareTo("LG") == 0) {
            return 3;

        } else {
            return 2;
        }

    }

    public int Precio() {
        if (getPrecio() < 100) {
            return 2;
        } else if (getPrecio() <= 350) {
            return 3;
        } else {
            return 4;
        }

    }

    public int Pixelaje() {
        if (getCamprincipal() <= 5) {
            if (getCamsecundaria() < 2) {
                return 1;
            } else {
                return 2;
            }
        } else if (getCamprincipal() <= 8) {
            if (getCamsecundaria() < 2) {
                return 1;
            } else if (getCamsecundaria() <= 3) {
                return 2;

            } else {
                return 3;
            }
        } else {
            if (getCamsecundaria() < 2) {
                return 1;
            } else if (getCamsecundaria() <= 5) {
                return 2;
            } else {
                return 3;
            }
        }

    }

    /**
     * @return the camprincipal
     */
    public int getCamprincipal() {
        return camprincipal;
    }

    /**
     * @param camprincipal the camprincipal to set
     */
    public void setCamprincipal(int camprincipal) {
        this.camprincipal = camprincipal;
    }

    /**
     * @return the camsecundaria
     */
    public int getCamsecundaria() {
        return camsecundaria;
    }

    /**
     * @param camsecundaria the camsecundaria to set
     */
    public void setCamsecundaria(int camsecundaria) {
        this.camsecundaria = camsecundaria;
    }

    /**
     * @return the flash
     */
    public boolean isFlash() {
        return flash;
    }

    /**
     * @param flash the flash to set
     */
    public void setFlash(boolean flash) {
        this.flash = flash;
    }
    public int Garantia(){
        if(getGarantia()<=3){
            return 1;
        }else if(getGarantia()<6){
            return 2;
        }else{
            return 3;
        }
        
        
        
    }
    public int Cpu(){
        if(getCpu()==2){
            return 0;
        }else if(getCpu()==4){
            return 1;
        }else if(getCpu()==6){
            return 2;
        }else if(getCpu()==8){
            return 3;
        }
        
        
        
        return 0;
    }
    public int Ram(){
        if(getRam()<1){
            return 0;
        }else if(getRam()<2){
            return 2;
        }else if(getRam()<4){
            return 4;
        }else{
            return 6;
        }
     
        
    }
}
