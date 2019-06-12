package fauziharuna.dev.bridgemonitoring.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import java.util.List;

import fauziharuna.dev.bridgemonitoring.R;
import fauziharuna.dev.bridgemonitoring.model.AllAnswer;
import fauziharuna.dev.bridgemonitoring.model.AllEngineer;

public class AnswerAdapter extends RecyclerView.Adapter<AnswerAdapter.AnswerHolder> {

    public List<AllAnswer>answerItem;
    Context mContext;


    public AnswerAdapter(Context context,List<AllAnswer>answerItemList){
        this.mContext=context;
        this.answerItem=answerItemList;
    }


    @NonNull
    @Override
    public AnswerHolder onCreateViewHolder( ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view =layoutInflater.inflate(R.layout.form_item,parent,false);
        return new AnswerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnswerHolder answerHolder, int position) {
        answerHolder.bridgeNameText.setText(answerItem.get(position).getBridgeName());
        answerHolder.kerusakanText.setText(answerItem.get(position).getKerusakan());
        answerHolder.engineerNameText.setText(answerItem.get(position).getSurveyorName());
        answerHolder.iksText.setText(answerItem.get(position).getIKS().toString());

    }

    @Override
    public int getItemCount() {
        return answerItem == null ?0 : answerItem.size();
    }

    public class AnswerHolder extends RecyclerView.ViewHolder {
        public View mView;

        TextView bridgeNameText;
        TextView engineerNameText,kerusakanText,iksText;

        public AnswerHolder( View itemView) {

            super(itemView);
            mView=itemView;
            bridgeNameText=itemView.findViewById(R.id.tv_bridgeName);
            engineerNameText=itemView.findViewById(R.id.tv_engineer);
            kerusakanText=itemView.findViewById(R.id.tv_kerusakan);
            iksText=itemView.findViewById(R.id.tv_iks);

        }
    }
}
