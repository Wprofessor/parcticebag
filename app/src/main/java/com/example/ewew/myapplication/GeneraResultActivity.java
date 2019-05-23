//package com.example.ewew.myapplication;
//
//import android.content.Context;
//import android.os.Bundle;
//import android.os.TestLooperManager;
//import android.support.annotation.Nullable;
//import android.support.v7.app.AppCompatActivity;
//import android.widget.TextView;
//
//import com.baidu.ocr.sdk.OCR;
//import com.baidu.ocr.sdk.OnResultListener;
//import com.baidu.ocr.sdk.exception.OCRError;
//import com.baidu.ocr.sdk.model.GeneralParams;
//import com.baidu.ocr.sdk.model.GeneralResult;
//import com.baidu.ocr.sdk.model.Word;
//import com.baidu.ocr.sdk.model.WordSimple;
//
//import java.io.File;
//
//public class GeneraResultActivity extends AppCompatActivity{
//    private TextView textView;
//    private static StringBuilder resultWord;
//    interface ServiceListener {
//        public void onResult(String result);
//    }
//
//    @Override
//        protected void onCreate(@Nullable Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.result_pop);
//            textView = findViewById(R.id.result_text);
//
//            textView.setText(resultWord);
//    }
//
//    public static void  recGeneral(Context ctx, String filePath, final GeneraResultActivity.ServiceListener listener) {
//        GeneralParams param = new GeneralParams();
//        param.setDetectDirection(true);
//        param.setVertexesLocation(true);
//        param.setRecognizeGranularity(GeneralParams.GRANULARITY_SMALL);
//        param.setImageFile(new File(filePath));
//        OCR.getInstance(ctx).recognizeGeneral(param, new OnResultListener<GeneralResult>() {
//            @Override
//            public void onResult(GeneralResult result) {
//                StringBuilder sb = new StringBuilder();
//                for (WordSimple wordSimple : result.getWordList()) {
//                    Word word = (Word) wordSimple;
//                    sb.append(word.getWords());
//                    sb.append("\n");
//                }
//                resultWord = sb;
//                listener.onResult(result.getJsonRes());
//            }
//
//            @Override
//            public void onError(OCRError error) {
//                listener.onResult(error.getMessage());
//            }
//        });
//
//    }
//
//
//}
