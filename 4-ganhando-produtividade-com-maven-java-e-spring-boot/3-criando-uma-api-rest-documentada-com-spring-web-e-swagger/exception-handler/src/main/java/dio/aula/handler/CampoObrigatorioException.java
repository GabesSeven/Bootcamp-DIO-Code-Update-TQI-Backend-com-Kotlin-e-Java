package dio.aula.handler;

public class CampoObrigatorioException extends BusinessException {
	public CampoObrigatorioException(String campo) {
		super("O campo %s é obrigatorio", campo);
	}
}
