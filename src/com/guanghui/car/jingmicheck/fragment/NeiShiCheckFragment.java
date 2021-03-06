package com.guanghui.car.jingmicheck.fragment;

import java.util.ArrayList;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.guanghui.car.R;
import com.guanghui.car.jingmicheck.model.CheckItem;
import com.guanghui.car.jingmicheck.model.DefectDepartModel;
import com.guanghui.car.jingmicheck.util.CheckRegionBuildUtil;
import com.guanghui.car.jingmicheck.util.DefectBuildUtil;
import com.guanghui.car.jingmicheck.widget.CheckView;
import com.guanghui.car.jingmicheck.widget.CheckView.CheckStateListener;
import com.guanghui.car.jingmicheck.widget.DefectListItemView;

public class NeiShiCheckFragment extends BaseCheckFragment implements CheckStateListener, OnClickListener {

    private CheckView mCheckView;
    private ArrayList<CheckItem> itemList;
    private Button addAreaBtn;
    private Button addPointBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        System.out.println("NeiShiCheckFragment:onCreateView");
        View rootView = inflater.inflate(R.layout.neishi_check_fragment_layout, null);
        mCheckView = (CheckView) rootView.findViewById(R.id.check_view);
        mCheckView.setBackgroundResource(R.drawable.neishi);
//        addAreaBtn = (Button) rootView.findViewById(R.id.add_area);
//        addAreaBtn.setOnClickListener(this);
//        addPointBtn = (Button) rootView.findViewById(R.id.add_point);
//        addPointBtn.setOnClickListener(this);
//        mCheckView.setAddModel();
        View addview = rootView.findViewById(R.id.change_layout);
        addview.setVisibility(View.GONE);


        mShowListView = (LinearLayout) rootView.findViewById(R.id.show_layout);
        initDefectModels();
        initCheckItems();
        return rootView;
    }


    @Override
    public void onItemSelect(CheckItem item) {
        showeditPage(item.model);
        mSelectCheckItemIndex = itemList.indexOf(item);
    }

    @Override
    public void refreshCheckView() {
        mCheckView.invalidate();
    }

    @Override
    public void refreshDefectViews(int mSelectCheckItemIndex2) {
        ((DefectListItemView) mShowListView.getChildAt(mSelectCheckItemIndex2)).initView();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.add_area:
                mCheckView.addPathAndClear();
                break;
            case R.id.add_point:
                mCheckView.startAddPoint();
                break;
            default:

        }
    }

    @Override
    public void initCheckItems() {
        itemList = new ArrayList<CheckItem>();
        DefectDepartModel model;

        model = defectModelList.get(1);
        itemList.add(CheckRegionBuildUtil.makeCheckItem(model));
        mShowListView.addView(new DefectListItemView(getActivity(), model));
        model = defectModelList.get(2);
        itemList.add(CheckRegionBuildUtil.makeCheckItem(model));
        mShowListView.addView(new DefectListItemView(getActivity(), model));
        model = defectModelList.get(3);
        itemList.add(CheckRegionBuildUtil.makeCheckItem(model));
        mShowListView.addView(new DefectListItemView(getActivity(), model));
        model = defectModelList.get(4);
        itemList.add(CheckRegionBuildUtil.makeCheckItem(model));
        mShowListView.addView(new DefectListItemView(getActivity(), model));
        model = defectModelList.get(5);
        itemList.add(CheckRegionBuildUtil.makeCheckItem(model));
        mShowListView.addView(new DefectListItemView(getActivity(), model));
        model = defectModelList.get(6);
        itemList.add(CheckRegionBuildUtil.makeCheckItem(model));
        mShowListView.addView(new DefectListItemView(getActivity(), model));
        model = defectModelList.get(8);
        itemList.add(CheckRegionBuildUtil.makeCheckItem(model));
        mShowListView.addView(new DefectListItemView(getActivity(), model));
        model = defectModelList.get(9);
        itemList.add(CheckRegionBuildUtil.makeCheckItem(model));
        mShowListView.addView(new DefectListItemView(getActivity(), model));
        model = defectModelList.get(10);
        itemList.add(CheckRegionBuildUtil.makeCheckItem(model));
        mShowListView.addView(new DefectListItemView(getActivity(), model));
        model = defectModelList.get(11);
        itemList.add(CheckRegionBuildUtil.makeCheckItem(model));
        mShowListView.addView(new DefectListItemView(getActivity(), model));
        model = defectModelList.get(12);
        itemList.add(CheckRegionBuildUtil.makeCheckItem(model));
        mShowListView.addView(new DefectListItemView(getActivity(), model));
        model = defectModelList.get(13);
        itemList.add(CheckRegionBuildUtil.makeCheckItem(model));
        mShowListView.addView(new DefectListItemView(getActivity(), model));
        model = defectModelList.get(14);
        itemList.add(CheckRegionBuildUtil.makeCheckItem(model));
        mShowListView.addView(new DefectListItemView(getActivity(), model));
        model = defectModelList.get(15);
        itemList.add(CheckRegionBuildUtil.makeCheckItem(model));
        mShowListView.addView(new DefectListItemView(getActivity(), model));
        model = defectModelList.get(16);
        itemList.add(CheckRegionBuildUtil.makeCheckItem(model));
        mShowListView.addView(new DefectListItemView(getActivity(), model));
        model = defectModelList.get(17);
        itemList.add(CheckRegionBuildUtil.makeCheckItem(model));
        mShowListView.addView(new DefectListItemView(getActivity(), model));
        model = defectModelList.get(18);
        itemList.add(CheckRegionBuildUtil.makeCheckItem(model));
        mShowListView.addView(new DefectListItemView(getActivity(), model));
        model = defectModelList.get(19);
        itemList.add(CheckRegionBuildUtil.makeCheckItem(model));
        mShowListView.addView(new DefectListItemView(getActivity(), model));
        model = defectModelList.get(20);
        itemList.add(CheckRegionBuildUtil.makeCheckItem(model));
        mShowListView.addView(new DefectListItemView(getActivity(), model));
        model = defectModelList.get(21);
        itemList.add(CheckRegionBuildUtil.makeCheckItem(model));
        mShowListView.addView(new DefectListItemView(getActivity(), model));
        model = defectModelList.get(22);
        itemList.add(CheckRegionBuildUtil.makeCheckItem(model));
        mShowListView.addView(new DefectListItemView(getActivity(), model));
        model = defectModelList.get(23);
        itemList.add(CheckRegionBuildUtil.makeCheckItem(model));
        mShowListView.addView(new DefectListItemView(getActivity(), model));
        model = defectModelList.get(24);
        itemList.add(CheckRegionBuildUtil.makeCheckItem(model));
        mShowListView.addView(new DefectListItemView(getActivity(), model));
        model = defectModelList.get(25);
        itemList.add(CheckRegionBuildUtil.makeCheckItem(model));
        mShowListView.addView(new DefectListItemView(getActivity(), model));

        model = defectModelList.get(0);
        itemList.add(CheckRegionBuildUtil.makeCheckItem(model));
        mShowListView.addView(new DefectListItemView(getActivity(), model));
        model = defectModelList.get(7);
        itemList.add(CheckRegionBuildUtil.makeCheckItem(model));
        mShowListView.addView(new DefectListItemView(getActivity(), model));

        mCheckView.setItems(itemList);
        mCheckView.setCheckListener(this);

    }

    @Override
    public void initDefectModels() {
        itemList = new ArrayList<CheckItem>();
        DefectDepartModel model;
        for (int i = 0; i < 26; i++) {
            model = DefectBuildUtil.makeDefectDepart(1, i);
            defectModelList.add(model);
        }
    }

}
