package br.com.techsow.sherlock.model.interfaces.bo;

import java.sql.SQLException;

public interface IBaseBO<Entity> {
	public int add(Entity obj); 
	public Entity getById(int id);
	public int kill(int id);
	public int update(Entity obj);
}
