package DAO;

import java.util.HashMap;

public abstract class DAOMap<K,V> {
	public abstract HashMap<K,V> getHashMap();
	public abstract void setHashMap(HashMap<K,V> h);
}
