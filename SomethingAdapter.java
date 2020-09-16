public class SomethingAdapter extends RecyclerView.Adapter<SomethingViewHolder> {

    private List<Something> data;
    
    public SomethingAdapter(List<Room> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public SomethingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.something_row, parent, false);
        return new SomethingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RoomsViewHolder holder, int position) {
        holder.textView.setText(data.get(position).getName());
        holder.textView.setText(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void add(int position, Something item){
        data.add(position, item);
        notifyItemInserted(position);
    }

    public void remove(int position){
        data.remove(position);
        notifyItemRemoved(position);
    }
}
