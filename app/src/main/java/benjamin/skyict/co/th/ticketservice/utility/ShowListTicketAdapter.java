package benjamin.skyict.co.th.ticketservice.utility;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import benjamin.skyict.co.th.ticketservice.R;

public class ShowListTicketAdapter extends BaseAdapter {

    private Context context;
    private String[] docNoStrings, serialNumberStrings, detailStrings, sevarityStrings,
            assigneeStrings, statusStrings, dueDateStrings;

    public ShowListTicketAdapter(Context context, String[] docNoStrings,
                                 String[] serialNumberStrings,
                                 String[] detailStrings,
                                 String[] sevarityStrings,
                                 String[] assigneeStrings,
                                 String[] statusStrings,
                                 String[] dueDateStrings) {
        this.context = context;
        this.docNoStrings = docNoStrings;
        this.serialNumberStrings = serialNumberStrings;
        this.detailStrings = detailStrings;
        this.sevarityStrings = sevarityStrings;
        this.assigneeStrings = assigneeStrings;
        this.statusStrings = statusStrings;
        this.dueDateStrings = dueDateStrings;
    }

    @Override
    public int getCount() {
        return docNoStrings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = layoutInflater.inflate(R.layout.listview_showitem, parent, false);

        TextView docNoTextView = view.findViewById(R.id.txtDocNo);
        TextView serialTextView = view.findViewById(R.id.txtSerial);
        TextView datailTextView = view.findViewById(R.id.txtDetail);
        TextView severityTextView = view.findViewById(R.id.txtSevarity);
        TextView assignTextView = view.findViewById(R.id.txtAssignee);
        TextView statusTextView = view.findViewById(R.id.txtStatus);
        TextView dueDateTextView = view.findViewById(R.id.txtDuedate);

        docNoTextView.setText(docNoStrings[position]);
        serialTextView.setText(serialNumberStrings[position]);
        datailTextView.setText(detailStrings[position]);
        severityTextView.setText(sevarityStrings[position]);
        assignTextView.setText(assigneeStrings[position]);
        statusTextView.setText(statusStrings[position]);
        dueDateTextView.setText(dueDateStrings[position]);

        return view;
    }
}
