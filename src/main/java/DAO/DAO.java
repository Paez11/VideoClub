package DAO;
import java.util.List;

public abstract class DAO<T> {
	public abstract List<T> getList();
	public abstract void setList(List<T> l);

}
