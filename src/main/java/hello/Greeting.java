package hello;

public class Greeting {

    private long id;
    private String content;
    private Character tipo;
    private String telefone;
    private String email;
    private Integer validade;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

	public Character getTipo() {
		return tipo;
	}

	public void setTipo(Character tipo) {
		this.tipo = tipo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getValidade() {
		return validade;
	}

	public void setValidade(Integer validade) {
		this.validade = validade;
	}

}
