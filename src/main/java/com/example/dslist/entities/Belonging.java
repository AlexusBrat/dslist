package com.example.dslist.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {

    // Atributos
    @EmbeddedId
    private BelongingPk id = new BelongingPk();
    private Integer position;

    // Construtor
    // Construtor sem argumento
    public Belonging() {

    }

    // Construtor com argumento
    public Belonging(Game game, GameList list, Integer position) {
        this.id.setGame(game);
        this.id.setList(list);
        this.position = position;
    }

    // Get/Set
    public BelongingPk getId() {
        return id;
    }
    public void setId(BelongingPk id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }
    public void setPosition(Integer position) {
        this.position = position;
    }
    
    // Métodos
    @Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Belonging other = (Belonging) obj;
		return Objects.equals(id, other.id);
    }
}
