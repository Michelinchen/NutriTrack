package htw.webtech.NutriTrack;

import jakarta.persistence.*;

@Entity
public class MealEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Embedded
    private Macronutrient macro;

    public MealEntry() {}

    public MealEntry( String name,  Macronutrient macro){
        this.name = name;
        this.macro = macro;
    }

    public Long getId() {return id;}

    public String getName() {
        return name;
    }

    public Macronutrient getMacro() {
        return macro;
    }

    public void setId(Long id) {this.id = id;}

    public void setName(String name) {this.name = name;}

    public void setMacro(Macronutrient macro) {this.macro = macro;}
}
