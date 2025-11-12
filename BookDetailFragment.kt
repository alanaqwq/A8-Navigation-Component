class BookDetailFragment : Fragment(R.layout.fragment_book_detail) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val args = BookDetailFragmentArgs.fromBundle(requireArguments())
        view.findViewById<TextView>(R.id.txtBookTitle).text = args.bookTitle
    }
}
