package com.sunknowledge.dme.rcm.documentutil;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPCellEvent;
import com.itextpdf.text.pdf.PdfPTable;

public class CustomDottedCell implements PdfPCellEvent {

    private int border = 0;
    public CustomDottedCell(int border) {
        this.border = border;
    }

    @Override
    public void cellLayout(PdfPCell cell, Rectangle position,
        PdfContentByte[] canvases) {
        PdfContentByte canvas = canvases[PdfPTable.LINECANVAS];
        canvas.saveState();
        canvas.setLineDash(0, 4, 2);
        if ((border & PdfPCell.TOP) == PdfPCell.TOP) {
            canvas.moveTo(position.getRight(), position.getTop());
            canvas.lineTo(position.getLeft(), position.getTop());
        }
        if ((border & PdfPCell.BOTTOM) == PdfPCell.BOTTOM) {
            canvas.moveTo(position.getRight(), position.getBottom());
            canvas.lineTo(position.getLeft(), position.getBottom());
        }
        if ((border & PdfPCell.RIGHT) == PdfPCell.RIGHT) {
            canvas.moveTo(position.getRight(), position.getTop());
            canvas.lineTo(position.getRight(), position.getBottom());
        }
        if ((border & PdfPCell.LEFT) == PdfPCell.LEFT) {
            canvas.moveTo(position.getLeft(), position.getTop());
            canvas.lineTo(position.getLeft(), position.getBottom());
        }
        canvas.stroke();
        canvas.restoreState();
        canvas.setColorFill(BaseColor.BLACK);
    }


}
