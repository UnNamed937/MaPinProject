package myapplication.example.mapinproject;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

public class Post_DeleteDialog2 extends DialogFragment {

    // ダイアログが生成された時に呼ばれるメソッド ※必須
    public Dialog onCreateDialog(Bundle savedInstanceState){
        // ダイアログ生成  AlertDialogのBuilderクラスを指定してインスタンス化します
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(getActivity());
        // タイトル設定
        dialogBuilder.setTitle("削除の提案");
        // 表示する文章設定
        dialogBuilder.setMessage("削除の提案が完了しました");

        // OKボタン作成
        dialogBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialog, int which) {
                Activity parent = getActivity();
                Intent intent = new Intent(parent,Pin_infoActivity.class );
                startActivity(intent);
            }
        });


        // dialogBulderを返す
        return dialogBuilder.create();
    }

}