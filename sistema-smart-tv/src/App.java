public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        SmartTv smartTv = new SmartTv();
        smartTv.setModelo("CH1");        
        smartTv.setMarca("LG");
        smartTv.setCanal(13);
        smartTv.setVolume(35);
        smartTv.desligar();
        smartTv.aumentarCanal();
        smartTv.diminuirVolume();

        System.out.println("Tv Modelo: " + smartTv.getModelo() + " Marca: " + smartTv.getMarca() + " Está ligada? "
                + smartTv.isLigada() + " No Canal: " + smartTv.getCanal() + " No Volume: " + smartTv.getVolume()
        );

    }
}
