package models;

public class Brand {

    private String brandname;
    private CarModel[] models;

    public Brand(String name, CarModel[] models) {
        this.brandname = name;
        this.models = models;
    }

    public String getBrandName() {
        return brandname;
    }

    public CarModel[] getModels() {
        return models;
    }

    public void setbrandName(String name) {
        this.brandname = name;
    }

    public void setModels(CarModel[] models) {
        this.models = models;
    }

    public int getTotalValidYears() {
        int total = 0;
        if (models == null) return 0;
        for (CarModel model : models) {
            if (model == null || model.getYears() == null) continue;
            for (CarYear year : model.getYears()) {
                if (year != null && year.isValid()) {
                    total++;
                }
            }
        }
        return total;
    }

    @Override
    public String toString() {
        return brandname + " - Años válidos: " + getTotalValidYears();
    }
}