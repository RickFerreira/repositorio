import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class FonteAlimentacaoBean {
	private FonteAlimentacao fonteAlimentacao;
	private ArrayList<FonteAlimentacao> fonteAlimentacoes;

	public FonteAlimentacaoBean() {
		fonteAlimentacao = new FonteAlimentacao();
		fonteAlimentacoes = new ArrayList<FonteAlimentacao>();
	}

	public FonteAlimentacao getFontealimentacao() {
		return fonteAlimentacao;
	}

	public void setFontealimentacao(FonteAlimentacao fontealimentacao) {
		this.fonteAlimentacao = fontealimentacao;
	}

	public ArrayList<FonteAlimentacao> getFontelimentacoes() {
		return fonteAlimentacoes;
	}

	public void setFontelimentacoes(ArrayList<FonteAlimentacao> fontelimentacoes) {
		this.fonteAlimentacoes = fontelimentacoes;
	}

}
