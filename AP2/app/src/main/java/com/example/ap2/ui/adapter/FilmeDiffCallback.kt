import androidx.recyclerview.widget.DiffUtil
import com.example.ap2.data.Filme

class FilmeDiffCallback : DiffUtil.ItemCallback<Filme>() {
    override fun areItemsTheSame(oldItem: Filme, newItem: Filme): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Filme, newItem: Filme): Boolean {
        return oldItem == newItem
    }
}
