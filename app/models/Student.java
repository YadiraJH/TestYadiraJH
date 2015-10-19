package models;

import play.db.ebean.Model;
import javax.persistence.*;

@Entity
public class Student extends Model{
    @Id
    public int id;
    public String name;
	public String lastname;
    public int semester;
}