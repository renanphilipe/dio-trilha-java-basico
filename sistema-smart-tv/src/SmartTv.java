public class SmartTv {

  private boolean ligada = false;
  private int canal = 1;
  private int volume = 25;
  private String modelo;
  private String marca;
  
  public SmartTv(boolean ligada, int canal, int volume, String modelo, String marca) {
    this.ligada = ligada;
    this.canal = canal;
    this.volume = volume;
    this.modelo = modelo;
    this.marca = marca;
  }

  public SmartTv() {
  }

   public boolean isLigada() {
    return ligada;
  }

  public void setLigada(boolean ligada) {
    this.ligada = ligada;
  }

  public int getCanal() {
    return canal;
  }

  public void setCanal(int canal) {
    this.canal = canal;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  
  public void ligar() {
    this.ligada = true;
  }
  
  public void desligar() {
    this.ligada = false;
  }

  public void aumetarVolume() {
    this.volume++;
  }

  public void diminuirVolume() {
    this.volume--;
  }
  
  public void aumentarCanal() {
    this.canal++;
  }

  public void diminuirCanal() {
    this.canal--;
  }


}
