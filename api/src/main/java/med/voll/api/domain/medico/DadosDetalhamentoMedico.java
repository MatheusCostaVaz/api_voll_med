package med.voll.api.domain.medico;

import med.voll.api.domain.endereco.Endereco;

public record DadosDetalhamentoMedico(Long id, Boolean ativo, String nome, String email, String crm, String telefone, Especialidade especiliadade, Endereco endereco) {
	
	public DadosDetalhamentoMedico(Medico medico) {
		this(medico.getId(), medico.getAtivo(), medico.getNome(), 
				medico.getEmail(),medico.getCrm(),
				medico.getTelefone(), medico.getEspecialidade(), 
				medico.getEndereco());
	}
}
