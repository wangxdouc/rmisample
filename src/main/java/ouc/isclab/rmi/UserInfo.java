package ouc.isclab.rmi;

import java.io.Serializable;

/**
 * UserInfo
 * <p>
 * 注意：UserInfo需要实现Serializable接口，标志自身是一个支持序列号的类，
 * 确保能够通过网络传输序列化的对象
 */
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String description;

    public UserInfo() {
    }

    public UserInfo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInfo() {
        return "Id: " + id + " Name: " + name;
    }
}
