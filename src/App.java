import controllers.BrandController;
import models.Brand;
import models.CarModel;
import models.CarYear;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Examen interciclo de Estructuras de Datos");
        System.out.println("====Configurar studente.env====");

        Brand[] brands = createBrands();
        BrandController controller = new BrandController();

 
        System.out.println("Original:");
        for (Brand b : brands) {
            System.out.println(b.getBrandName() + " - Años válidos: " + b.getTotalValidYears());
        }
        
        controller.sortSelectionAsc(brands);
        System.out.println("\nOrdenado por Selection Sort Ascendente:");
        for (Brand b : brands) {
            System.out.println(b.getBrandName() + " - Años válidos: " + b.getTotalValidYears());
        }

        int buscar1 = 5; 
        Brand f1 = controller.binarySearchByValidYears(brands, buscar1, true);
        System.out.println("\nBuscar marca con " + buscar1 + " años válidos que se ordenaron de mayor a menor:");
        if (f1 != null)
            System.out.println("Encontrada: Marca: " + f1.getBrandName() + ", Total de años válidos: " + f1.getTotalValidYears());
        else
            System.out.println("No encontrada");
        int buscar2 = 3; 
        Brand f2 = controller.binarySearchByValidYears(brands, buscar2, true);

        System.out.println("\nBuscar marca con " + buscar2 + " años válidos que se ordenaron de mayor a menor:");
        if (f2 != null)
            System.out.println("Encontrada: Marca: " + f2.getBrandName() + ", Total de años válidos: " + f2.getTotalValidYears());
        else
            System.out.println("No encontrada");
    }

    

    public static Brand[] createBrands() {

        CarYear[] civicYears = {
                new CarYear(2018, false),
                new CarYear(2019, true),
                new CarYear(2020, false),
                new CarYear(2021, false),
                new CarYear(2022, true),
                new CarYear(2023, false)
        };

        CarYear[] accordYears = {
                new CarYear(2017, true),
                new CarYear(2018, false),
                new CarYear(2019, true),
                new CarYear(2020, true),
                new CarYear(2021, false),
                new CarYear(2022, true)
        };

        CarModel[] hondaModels = {
                new CarModel("Civic", civicYears),
                new CarModel("Accord", accordYears)
        };

        Brand honda = new Brand("Honda", hondaModels);

        CarYear[] corollaYears = {
                new CarYear(2017, true),
                new CarYear(2018, true),
                new CarYear(2019, false),
                new CarYear(2020, true),
                new CarYear(2021, true),
                new CarYear(2022, true),
                new CarYear(2023, true)
        };

        CarYear[] camryYears = {
                new CarYear(2018, true),
                new CarYear(2019, true),
                new CarYear(2020, true),
                new CarYear(2021, false),
                new CarYear(2022, false),
                new CarYear(2023, true)
        };

        CarModel[] toyotaModels = {
                new CarModel("Corolla", corollaYears),
                new CarModel("Camry", camryYears)
        };

        Brand toyota = new Brand("Toyota", toyotaModels);

        CarYear[] mustangYears = {
                new CarYear(2016, true),
                new CarYear(2017, false),
                new CarYear(2018, true),
                new CarYear(2019, false),
                new CarYear(2020, false),
                new CarYear(2021, false),
                new CarYear(2022, false)
        };

        CarYear[] f150Years = {
                new CarYear(2017, false),
                new CarYear(2018, true),
                new CarYear(2019, false),
                new CarYear(2020, true),
                new CarYear(2021, true),
                new CarYear(2022, false)
        };

        CarModel[] fordModels = {
                new CarModel("Mustang", mustangYears),
                new CarModel("F-150", f150Years)
        };

        Brand ford = new Brand("Ford", fordModels);

        CarYear[] silveradoYears = {
                new CarYear(2016, false),
                new CarYear(2017, true),
                new CarYear(2018, true),
                new CarYear(2019, false),
                new CarYear(2020, true),
                new CarYear(2021, false),
                new CarYear(2022, true)
        };

        CarYear[] camaroYears = {
                new CarYear(2017, true),
                new CarYear(2018, false),
                new CarYear(2019, true),
                new CarYear(2020, false),
                new CarYear(2021, true),
                new CarYear(2022, true)
        };

        CarModel[] chevroletModels = {
                new CarModel("Silverado", silveradoYears),
                new CarModel("Camaro", camaroYears)
        };

        Brand chevrolet = new Brand("Chevrolet", chevroletModels);

        // ===== NISSAN =====
        CarYear[] altimaYears = {
                new CarYear(2016, true),
                new CarYear(2017, false),
                new CarYear(2018, false),
                new CarYear(2019, true),
                new CarYear(2020, true),
                new CarYear(2021, false),
                new CarYear(2022, true)
        };

        CarYear[] sentraYears = {
                new CarYear(2017, false),
                new CarYear(2018, true),
                new CarYear(2019, true),
                new CarYear(2020, false),
                new CarYear(2021, true),
                new CarYear(2022, false)
        };

        CarModel[] nissanModels = {
                new CarModel("Altima", altimaYears),
                new CarModel("Sentra", sentraYears)
        };

        Brand nissan = new Brand("Nissan", nissanModels);

        // ===== MAZDA =====
        CarYear[] mazda3Years = {
                new CarYear(2016, true),
                new CarYear(2017, true),
                new CarYear(2018, true),
                new CarYear(2019, true),
                new CarYear(2020, true),
                new CarYear(2021, true),
                new CarYear(2022, true)
        };

        CarYear[] cx5Years = {
                new CarYear(2017, true),
                new CarYear(2018, true),
                new CarYear(2019, true),
                new CarYear(2020, false),
                new CarYear(2021, true),
                new CarYear(2022, true)
        };

        CarModel[] mazdaModels = {
                new CarModel("Mazda3", mazda3Years),
                new CarModel("CX-5", cx5Years)
        };

        Brand mazda = new Brand("Mazda", mazdaModels);

        // ===== HYUNDAI =====
        CarYear[] elantraYears = {
                new CarYear(2016, true),
                new CarYear(2017, true),
                new CarYear(2018, false),
                new CarYear(2019, true),
                new CarYear(2020, false),
                new CarYear(2021, false),
                new CarYear(2022, true)
        };

        CarYear[] tucsonYears = {
                new CarYear(2017, false),
                new CarYear(2018, true),
                new CarYear(2019, true),
                new CarYear(2020, true),
                new CarYear(2021, false),
                new CarYear(2022, true)
        };

        CarModel[] hyundaiModels = {
                new CarModel("Elantra", elantraYears),
                new CarModel("Tucson", tucsonYears)
        };

        Brand hyundai = new Brand("Hyundai", hyundaiModels);

        return new Brand[] { honda, toyota, ford, chevrolet, nissan, mazda, hyundai };
    }

}
