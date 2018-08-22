package com.simplelogin.mahdi_soofi.test_lambda

import android.widget.SeekBar

fun SeekBar.onSeekBarChangeListener(onProgressChanged: (seekBar: SeekBar?, value: Int, p2: Boolean) -> Unit,
                                    onStartTrackingTouch:(seekBar: SeekBar?)-> Unit,
                                    onStopTrackingTouch :(seekBar: SeekBar?) -> Unit)
{
    this.setOnSeekBarChangeListener (object: SeekBar.OnSeekBarChangeListener
    {
        override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
            onProgressChanged(p0, p1, p2)
        }

        override fun onStartTrackingTouch(p0: SeekBar?) {
            onStartTrackingTouch(p0)
        }

        override fun onStopTrackingTouch(p0: SeekBar?) {
            onStopTrackingTouch(p0)
        }
    })
}
