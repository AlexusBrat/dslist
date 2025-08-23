package com.example.dslist.dto;

public class ReplacementDTO {

    // Atributos
    private Integer sourceIndex;
    private Integer destinationIndex;

    // Construtor
    // Construtor sem argumento
    public ReplacementDTO() {

    }

    // Construtor com argumento
    public ReplacementDTO( Integer sourceIndex, Integer destinationIndex) {
        this.sourceIndex = sourceIndex;
        this.destinationIndex = destinationIndex;
    }

    // Get/Set
    public Integer getSourceIndex() {
        return sourceIndex;
    }
    public void setSourceIndex(Integer sourceIndex) {
        this.sourceIndex = sourceIndex;
    }

    public Integer getDestinationIndex() {
        return destinationIndex;
    }
    public void setDestinationIndex(Integer destinationIndex) {
        this.destinationIndex = destinationIndex;
    }

    
}
