public class Kettle {

    private int capacity;
    private int amountOfWater;
    private int waterTemperature;

    public Kettle(int capacity) {

        this.capacity = capacity;
        this.amountOfWater = 0;
        this.waterTemperature = 0;

    }




    public void addWater(int amountAdd){

        amountOfWater += amountAdd;

    }

    public void dispenseWater(int amountRemove) {

        amountOfWater -= amountRemove;

    }

    public void heat() {

        if (waterTemperature < 100){

            waterTemperature ++;
        }

        return waterTemperature;

        }

        public void cool() {

        if (waterTemperature > 20){

            waterTemperature --;

        }

        public boolean isBoiled() {

            return waterTemperature > 92;

            }


    }
}




