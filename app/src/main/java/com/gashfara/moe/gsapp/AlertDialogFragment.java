//ダイアログのクラスです。DialogFragmentを継承しています。KiiCloudのチュートリアルからコピー。
package com.gashfara.moe.gsapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class AlertDialogFragment extends DialogFragment {
    public static final String TAG = "AlertDialogFragment";
    private AlertDialogListener listener = null;
    public static AlertDialogFragment newInstance(int title, String message,
            AlertDialogListener listener) {
        AlertDialogFragment frag = new AlertDialogFragment();
        frag.listener = listener;
        Bundle args = new Bundle();
        args.putInt("title", title);
        args.putString("message", message);
        frag.setArguments(args);
        return frag;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        int title = getArguments().getInt("title");
        String message = getArguments().getString("message");

        return new AlertDialog.Builder(getActivity())
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton(android.R.string.ok,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int whichButton) {
                                if (listener != null)
                                    listener.onAlertFinished();
                                else
                                    dialog.dismiss();
                            }
                        }).create();

        //Dialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        // フルスクリーン
        //Dialog.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN);
        //Dialog.setContentView(R.layout.custom_dialog_fragment);
        // 背景を透明にする
        //Dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

    }

    static interface AlertDialogListener {
        public void onAlertFinished();
    }
}
