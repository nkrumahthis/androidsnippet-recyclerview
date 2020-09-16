public class SomethingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_something);
        initStuff(); // copy this
    }

    // copy this
    private void initStuff() {
        RecyclerView recyclerView = findViewById(R.id.rvRooms);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(new SomethingAdapter());
    }
}
