class BooksFragment : Fragment(R.layout.fragment_books) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val navController = findNavController()

        view.findViewById<Button>(R.id.btnDetails).setOnClickListener {
            val action = BooksFragmentDirections
                .actionBooksFragmentToBookDetailFragment("Dom Casmurro")
            navController.navigate(action)
        }
    }
}
