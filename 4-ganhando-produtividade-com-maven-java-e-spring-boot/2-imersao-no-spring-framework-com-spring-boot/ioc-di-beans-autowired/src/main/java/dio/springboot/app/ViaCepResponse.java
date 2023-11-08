package dio.springboot.app;

public class ViaCepResponse {
	private String cep;
	private String logradouro;
	private String localidade;
	
	public String getCep() { return cep; }
	
	public void setCep(String cep) { this.cep = cep; }

	public String getLogadouro() { return logradouro; }
	
	public void setLogadouro(String logradouro) { this.logradouro = logradouro; }

	public String getLocalidade() { return localidade; }
	
	public void setLocalidade(String localidade) { this.localidade= localidade; }

 @Override
    public String toString() {
        return "ViaCepResponse{" +
                "cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", localidade='" + localidade + '\'' +
                '}';
    }
	
}
