package com.guanghui.car.adapter;

import java.util.HashMap;
import java.util.List;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.guanghui.car.R;

/**
 * 车型登记中需要用到的下拉选项的数据集
 * @author zhangyun
 *
 */
public class CarDengjiAdapter extends BaseAdapter{

	private Context mContext;
	private List<HashMap> list;
	public CarDengjiAdapter(Context context,List<HashMap> list){
		this.mContext = context;
		this.list = list;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position).get("value").toString().trim();
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		LayoutInflater layoutInflater = LayoutInflater.from(mContext);
		convertView = layoutInflater.inflate(R.layout.spinner_item, null);
		
		try
		{
			TextView textView = (TextView) convertView.findViewById(R.id.spinnerText);
			textView.setText(list.get(position).get("value").toString());
			
			convertView.setTag(list.get(position).get("key").toString());
		}
		catch(Exception ex)
		{
			Log.e("CarDengjiAdapter。java error()", ex.getMessage());
		}
		
		return convertView;
	}

}
