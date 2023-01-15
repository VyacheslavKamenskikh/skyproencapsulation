package transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;

    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int placesNumber;
    private boolean tiers;

    public class Key{
        private final boolean remoteStart;
        private final boolean access;

        public Key(Boolean remoteStart, Boolean access) {
            if(remoteStart==null)
                this.remoteStart = false;
            else
                this.remoteStart = remoteStart;
            if(access==null)
                this.access = false;
            else
                this.access = access;
        }

        public boolean isAccess() {
            return access;
        }

        public boolean isRemoteStart() {
            return remoteStart;
        }
    }

    public Car(String brand,String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, String registrationNumber, int placesNumber, Boolean tires){
        if(brand==null)
            this.brand = "default";
        else
        if(brand.isEmpty())
            this.brand = "default";
        else
            this.brand = brand;
        if(model==null)
            this.model = "default";
        else
        if(model.isEmpty())
            this.model = "default";
        else
            this.model = model;
        if(engineVolume<=0)
            this.engineVolume = 1.5;
        else
            this.engineVolume = engineVolume;
        if(color==null)
            this.color = "default";
        else
        if(color.isEmpty())
            this.color = "белый";
        else
            this.color = color;
        if(year<=0)
            this.year = 2000;
        else
            this.year = year;
        if(country==null)
            this.country = "default";
        else
        if(country.isEmpty())
            this.country = "default";
        else
            this.country = country;

        if(transmission==null)
            this.transmission = "default";
        else
        if(transmission.isEmpty())
            this.transmission = "default";
        else
            this.transmission = transmission;

        if(bodyType==null)
            this.bodyType = "default";
        else
        if(bodyType.isEmpty())
            this.bodyType = "default";
        else
            this.bodyType = bodyType;

        if(registrationNumber==null)
            this.registrationNumber = "default";
        else
        if(registrationNumber.isEmpty())
            this.registrationNumber = "default";
        else
            this.registrationNumber = registrationNumber;

        if(placesNumber<=1)
            this.placesNumber = 2;
        else
            this.placesNumber = placesNumber;

        if(tires==null)
            this.tiers = false;
        else
            this.tiers = tires;
    }


//неизменяемые поля
    public int getYear() {
        return year;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPlacesNumber() {
        return placesNumber;
    }

    public String getCountry() {
        return country;
    }
//изменяемые поля


    public boolean isTiers() {
        return tiers;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setColor(String color) {
        if(color==null)
            this.color = "default";
        else
        if(color.isEmpty())
            this.color = "белый";
        else
            this.color = color;
    }

    public void setEngineVolume(double engineVolume) {
        if(engineVolume<=0)
            this.engineVolume = 1.5;
        else
            this.engineVolume = engineVolume;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if(registrationNumber==null)
            this.registrationNumber = "default";
        else
        if(registrationNumber.isEmpty())
            this.registrationNumber = "default";
        else
            this.registrationNumber = registrationNumber;
    }

    public void setTiers(Boolean tiers) {
        if(tiers == null)
            this.tiers=false;
        else
            this.tiers=tiers;
    }

    public void setTransmission(String transmission) {
        if(transmission==null)
            this.transmission = "default";
        else
        if(transmission.isEmpty())
            this.transmission = "default";
        else
            this.transmission = transmission;
    }

    public void changeTires(int month){
        if((month==11) || (month==12)|| (month==1)|| (month==2))
            this.tiers=true;
        else
            this.tiers=false;
    }

    @Override
    public String toString(){
        if(this.tiers)
            return this.brand+" "+this.model+", сборка: "+this.country+", Цвет кузова "+this.color+", объем двигателя "+this.engineVolume+" л., год выпуска "+this.year+", коробка передач: "+this.transmission+", Тип кузова: "+this.bodyType+", Регистрационный номер: "+this.registrationNumber+", количество мест: "+this.placesNumber+", Зимняя резина";
        else
            return this.brand+" "+this.model+", сборка: "+this.country+", Цвет кузова "+this.color+", объем двигателя "+this.engineVolume+" л., год выпуска "+this.year+", коробка передач: "+this.transmission+", Тип кузова: "+this.bodyType+", Регистрационный номер: "+this.registrationNumber+", количество мест: "+this.placesNumber+", Летняя резина";
    }
}