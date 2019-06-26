import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvToJavaObject {

	public List<Cenarios> convertCsvToJava() {

		String csvFileToRead = System.getProperty("user.dir") + "\\src\\csv\\cadastros.csv";
		BufferedReader br = null;
		String line = "";
		String splitBy = ";";
		boolean firstLine = true;

		List<Cenarios> cenarioList = new ArrayList<Cenarios>();

		try {
			
			br = new BufferedReader(new FileReader(csvFileToRead));
			
			while((line = br.readLine()) != null) {
				
				if(firstLine) {
					firstLine = false;
					continue;
				}
				
				String[] cenario = line.split(splitBy);
				
				Cenarios cenarioObject = new Cenarios();
				
				cenarioObject.setNr_teste(cenario[0]);
				cenarioObject.setTestar(cenario[1]);
				cenarioObject.setAmbiente(cenario[2]);
				cenarioObject.setCliente(cenario[3]);
				cenarioObject.setCenario(cenario[4]);
				cenarioObject.setNome(cenario[5]); 
				cenarioObject.setCPF(cenario[6]); 
				cenarioObject.setEmail(cenario[7]); 
				cenarioObject.setCelular(cenario[8]); 
				cenarioObject.setObjetivo_cadastroprivate(cenario[9]); 
				cenarioObject.setPossui_assessor(cenario[10]);
				cenarioObject.setAssessor(cenario[11]);
				cenarioObject.setAbra_conta_ok(cenario[12]);
				cenarioObject.setPlano(cenario[13]);
				cenarioObject.setEscolha_plano_ok(cenario[14]); 
				cenarioObject.setData_nascimento(cenario[15]); 
				cenarioObject.setEmancipado(cenario[16]); 
				cenarioObject.setResponsavel_legal(cenario[17]); 
				cenarioObject.setNome_responsavel_legal(cenario[18]);
				cenarioObject.setCPF_responsavel_legal(cenario[19]); 
				cenarioObject.setRG_responsavel_legal(cenario[20]); 
				cenarioObject.setEmail_responsavel_legal(cenario[21]); 
				cenarioObject.setUpload_documento_antecipacao(cenario[22]); 
				cenarioObject.setSexo(cenario[23]); 
				cenarioObject.setEmail_secundario(cenario[24]); 
				cenarioObject.setTelefone_fixo(cenario[25]); 
				cenarioObject.setPais_nascimento(cenario[26]); 
				cenarioObject.setEstado_nascimento(cenario[27]); 
				cenarioObject.setCidade_nascimento(cenario[28]); 
				cenarioObject.setNacionalidade_brasileira(cenario[29]); 
				cenarioObject.setEstado_civil(cenario[30]); 
				cenarioObject.setNome_pai(cenario[31]); 
				cenarioObject.setNome_mae(cenario[32]); 
				cenarioObject.setNome_conjuge_companheiro(cenario[33]); 
				cenarioObject.setCPF_conjuge_companheiro(cenario[34]); 
				cenarioObject.setInformacoes_pessoais_ok(cenario[35]); 
				cenarioObject.setTipo_documento(cenario[36]); 
				cenarioObject.setNumero_RG_CNH_ID_CN(cenario[37]); 
				cenarioObject.setEstado_emissor(cenario[38]); 
				cenarioObject.setOrgao_emissor(cenario[39]); 
				cenarioObject.setData_emissao(cenario[40]); 
				cenarioObject.setValidade(cenario[41]); 
				cenarioObject.setDocumentacao_ok(cenario[42]); 
				cenarioObject.setCEP(cenario[43]); 
				cenarioObject.setEndereco(cenario[44]); 
				cenarioObject.setNumero(cenario[45]); 
				cenarioObject.setComplemento(cenario[46]); 
				cenarioObject.setBairro(cenario[47]); 
				cenarioObject.setEndereco_ok(cenario[48]); 
				cenarioObject.setArea_ocupacao(cenario[49]); 
				cenarioObject.setProfissao(cenario[50]); 
				cenarioObject.setEspecifique_profissao(cenario[51]); 
				cenarioObject.setVinculo_empregaticio(cenario[52]); 
				cenarioObject.setTrabalhando_atualmente(cenario[53]); 
				cenarioObject.setAlguma_empresa(cenario[54]); 
				cenarioObject.setInstituicao(cenario[55]); 
				cenarioObject.setTelefone_instituicao(cenario[56]); 
				cenarioObject.setPossui_endereco(cenario[57]); 
				cenarioObject.setMesmo_residencial(cenario[58]); 
				cenarioObject.setCEP_comercial(cenario[59]); 
				cenarioObject.setEndereco_comercial(cenario[60]); 
				cenarioObject.setNumero_comercial(cenario[61]); 
				cenarioObject.setComplemento_comercial(cenario[62]); 
				cenarioObject.setBairro_comercial(cenario[63]); 
				cenarioObject.setInformacoes_profissionais_ok(cenario[64]); 
				cenarioObject.setBens_imoveis(cenario[65]); 
				cenarioObject.setOutros_bens_valores(cenario[66]); 
				cenarioObject.setRendimentos_mensais(cenario[67]); 
				cenarioObject.setOutros_rendimentos_mensais(cenario[68]); 
				cenarioObject.setValor_total_estimado_cedro(cenario[69]); 
				cenarioObject.setValor_total_estimado_rb(cenario[70]); 
				cenarioObject.setInformacoes_financeiras_patrimoniais_ok(cenario[71]); 
				cenarioObject.setTipo_conta1(cenario[72]);
				cenarioObject.setBanco1(cenario[73]); 
				cenarioObject.setAgencia1(cenario[74]); 
				cenarioObject.setConta1(cenario[75]); 
				cenarioObject.setDigito1(cenario[76]); 
				cenarioObject.setConta_conjunta1(cenario[77]); 
				cenarioObject.setConta_principal1(cenario[78]); 
				cenarioObject.setTitular_conta1(cenario[79]); 
				cenarioObject.setNome_titular1(cenario[80]); 
				cenarioObject.setCPF_titular1(cenario[81]); 
				cenarioObject.setComprovante_conta_bancaria1(cenario[82]); 
				cenarioObject.setTipo_conta2(cenario[83]);
				cenarioObject.setBanco2(cenario[84]); 
				cenarioObject.setAgencia2(cenario[85]); 
				cenarioObject.setConta2(cenario[86]); 
				cenarioObject.setDigito2(cenario[87]); 
				cenarioObject.setConta_conjunta2(cenario[88]); 
				cenarioObject.setConta_principal2(cenario[89]); 
				cenarioObject.setTitular_conta2(cenario[90]); 
				cenarioObject.setNome_titular2(cenario[91]); 
				cenarioObject.setCPF_titular2(cenario[92]); 
				cenarioObject.setComprovante_conta_bancaria2(cenario[93]); 
				cenarioObject.setTipo_conta3(cenario[94]); 
				cenarioObject.setBanco3(cenario[95]); 
				cenarioObject.setAgencia3(cenario[96]); 
				cenarioObject.setConta3(cenario[97]); 
				cenarioObject.setDigito3(cenario[98]); 
				cenarioObject.setConta_conjunta3(cenario[99]); 
				cenarioObject.setConta_principal3(cenario[100]); 
				cenarioObject.setTitular_conta3(cenario[101]); 
				cenarioObject.setNome_titular3(cenario[102]); 
				cenarioObject.setCPF_titular3(cenario[103]); 
				cenarioObject.setComprovante_conta_bancaria3(cenario[104]); 
				cenarioObject.setContas_bancarias_ok(cenario[105]); 
				cenarioObject.setPerfil_questao_1(cenario[106]); 
				cenarioObject.setPerfil_questao_2(cenario[107]); 
				cenarioObject.setPerfil_questao_3(cenario[108]); 
				cenarioObject.setPerfil_questao_4(cenario[109]); 
				cenarioObject.setPerfil_questao_5(cenario[110]); 
				cenarioObject.setPerfil_questao_6(cenario[111]); 
				cenarioObject.setPerfil_questao_7(cenario[112]); 
				cenarioObject.setPerfil_questao_8(cenario[113]); 
				cenarioObject.setPerfil_questao_8_1(cenario[114]); 
				cenarioObject.setPerfil_questao_8_2(cenario[115]); 
				cenarioObject.setPerfil_questao_8_3(cenario[116]); 
				cenarioObject.setPerfil_questao_8_4(cenario[117]); 
				cenarioObject.setPerfil_questao_9(cenario[118]); 
				cenarioObject.setPerfil_questao_10(cenario[119]); 
				cenarioObject.setPerfil_questao_11(cenario[120]); 
				cenarioObject.setPerfil_investidor_ok(cenario[121]); 
				cenarioObject.setUs_person(cenario[122]); 
				cenarioObject.setInvestidor_profissional(cenario[123]); 
				cenarioObject.setDeclaracao_ip(cenario[124]); 
				cenarioObject.setInvestidor_qualificado(cenario[125]); 
				cenarioObject.setDeclaracao_iq(cenario[126]); 
				cenarioObject.setPessoa_vinculada_corretora(cenario[127]); 
				cenarioObject.setDeclaracao_pessoa_vinculada(cenario[128]); 
				cenarioObject.setPessoa_politicamente_exposta(cenario[129]); 
				cenarioObject.setRelacionamento_pessoa_politicamente_exposta(cenario[130]); 
				cenarioObject.setDeclaracoes_ok(cenario[131]); 
				cenarioObject.setCadastrar_terceiros_procuradores(cenario[132]); 
				cenarioObject.setEmissao_ordem1(cenario[133]); 
				cenarioObject.setMovimentacao_conta_corrente1(cenario[134]); 
				cenarioObject.setMovimentacao_custodia1(cenario[135]); 
				cenarioObject.setAssinaturas_contratos_cambio1(cenario[136]); 
				cenarioObject.setNome_procurador1(cenario[137]); 
				cenarioObject.setCPF_procurador1(cenario[138]); 
				cenarioObject.setTelefone_procurador1(cenario[139]); 
				cenarioObject.setEmail_procurador1(cenario[140]); 
				cenarioObject.setDocumento_procurador1(cenario[141]); 
				cenarioObject.setCEP_procurador1(cenario[142]); 
				cenarioObject.setEndereco_procurador1(cenario[143]); 
				cenarioObject.setNumero_procurador1(cenario[144]); 
				cenarioObject.setComplemento_procurador1(cenario[145]); 
				cenarioObject.setBairro_procurador1(cenario[146]); 
				cenarioObject.setEmissao_ordem2(cenario[147]); 
				cenarioObject.setMovimentacao_conta_corrente2(cenario[148]); 
				cenarioObject.setMovimentacao_custodia2(cenario[149]); 
				cenarioObject.setAssinaturas_contratos_cambio2(cenario[150]); 
				cenarioObject.setNome_procurador2(cenario[151]); 
				cenarioObject.setCPF_procurador2(cenario[152]); 
				cenarioObject.setTelefone_procurador2(cenario[153]); 
				cenarioObject.setEmail_procurador2(cenario[154]); 
				cenarioObject.setDocumento_procurador2(cenario[155]); 
				cenarioObject.setCEP_procurador2(cenario[156]); 
				cenarioObject.setEndereco_procurador2(cenario[157]); 
				cenarioObject.setNumero_procurador2(cenario[158]); 
				cenarioObject.setComplemento_procurador2(cenario[159]); 
				cenarioObject.setBairro_procurador2(cenario[160]); 
				cenarioObject.setTerceiros_procuradores_ok(cenario[161]); 
				cenarioObject.setEndCor_endereco_residencial(cenario[162]); 
				cenarioObject.setEndCor_endereco_comercial(cenario[163]); 
				cenarioObject.setEndCor_por_email(cenario[164]); 
				cenarioObject.setEndCor_nao_desejo_receber_correspondencia(cenario[165]); 
				cenarioObject.setEndereco_correspondencia_ok(cenario[166]); 
				cenarioObject.setLi_aceito_termos(cenario[167]); 
				cenarioObject.setCondicoes_gerais_ok(cenario[168]); 
				cenarioObject.setPendencias_comprovante_endereco(cenario[169]); 
				cenarioObject.setPendencias_comprovante_doc_id(cenario[170]); 
				cenarioObject.setPendencias_ok(cenario[171]); 
				cenarioObject.setConfirma_email(cenario[172]); 
				cenarioObject.setNovo_email(cenario[173]); 
				cenarioObject.setConfirmacao_email_ok(cenario[173]); 
				cenarioObject.setCadastro_finalizado_ok(cenario[174]);
				
				cenarioList.add(cenarioObject);
				
			}
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return cenarioList;

	}

}
