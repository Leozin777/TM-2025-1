import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ap2.R
import com.example.ap2.data.Filme

class FilmeViewHolder(
    itemView: View,
    private val onDetails: (Filme) -> Unit,
    private val onDelete: (Filme) -> Unit
) : RecyclerView.ViewHolder(itemView) {
    private val idText: TextView = itemView.findViewById(R.id.idFilme)
    private val tituloText: TextView = itemView.findViewById(R.id.filmeTitulo)
    private val diretorText: TextView = itemView.findViewById(R.id.filmeDiretor)
    private val anoText: TextView = itemView.findViewById(R.id.filmeAno)
    private val sinopseText: TextView = itemView.findViewById(R.id.filmeSinopse)

    fun bind(filme: Filme) {
        idText.text = "ID: ${filme.id}"
        tituloText.text = filme.titulo
        diretorText.text = "Diretor: ${filme.diretor}"
        anoText.text = "Ano: ${filme.anoLancamento}"
        sinopseText.text = filme.sinopse

        itemView.setOnClickListener {
            onDelete(filme)
        }

        itemView.setOnLongClickListener {
            onDetails(filme)
            true
        }
    }
}
