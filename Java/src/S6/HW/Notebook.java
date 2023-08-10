package S6.HW;

import java.util.Objects;

public class Notebook {
    private String company;
    private String model;
    private String serialNumber;
    private String os;
    private Integer ram;
    private Integer memory;
    private double display;
    private Integer price;

    public Notebook(String company, String model, String serialNumber, String os, int ram, int memory, double display, int price) {
        this.company = company;
        this.model = model;
        this.serialNumber = serialNumber;
        this.os = os;
        this.ram = ram;
        this.memory = memory;
        this.display = display;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n" + "Фирма : " + company + "\n" +
               " Модель: " + model + "\n" +
               " Серийный номер : " + serialNumber + "\n" +
               " Операционная система : " + os + "\n" +
               " Оперативная память : " + ram + "\n" +
               " Накопитель : " + memory + "\n" +
               " Дисплей : " + display + "\n" +
               " Цена - " + price + "\n";
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(!(obj instanceof Notebook)) return false;
        Notebook notebook = (Notebook) obj;
        return company.equals(notebook.company) &&
                model.equals(notebook.model) &&
                serialNumber.equals(notebook.serialNumber) &&
                os.equals(notebook.os) &&
                ram.equals(notebook.ram) &&
                memory.equals(notebook.memory) &&
                Objects.equals(display, notebook.display) &&
                price.equals(notebook.price);
    }

    public String getСompany() {
        return company;
    }

    public int getRam() {
        return ram;
    }

    public int getHardDisk() {
        return memory;
    }

    public String getOperatingSystem() {
        return os;
    }
    
    public double getDisplay() {
        return display;
    }

    public int getPrice() {
        return price;
    }
}
