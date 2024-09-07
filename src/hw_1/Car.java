package hw_1;

    public class Car {
        private String model;
        private int power;
        private int volumeEngine;
        private boolean turbo;


        public Car(){}

        public Car(int power, String model, int volumeEngine, boolean turbo) {
            this.power = power;
            this.model = model;
            this.volumeEngine = volumeEngine;
            this.turbo = turbo;
        }


        public String getModel() {
            return model;
        }
        public void setModel(String model) {
            this.model = model;
        }

        public int getPower() {
            return power;
        }
        public void setPower(int power) {
            this.power = power;
        }

        public int getVolumeEngine() {
            return volumeEngine;
        }
        public void setVolumeEngine(int volumeEngine) {
            this.volumeEngine = volumeEngine;
        }

        public boolean isTurbo() {
            return turbo;
        }
        public void setTurbo(boolean turbo) {
            this.turbo = turbo;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "model='" + model + '\'' +
                    ", power=" + power +
                    ", volumeEngine=" + volumeEngine +
                    ", turbo=" + turbo +
                    '}';
        }
    }
