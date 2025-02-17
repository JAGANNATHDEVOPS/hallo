package com.sunknowledge.dme.rcm.documentutil;

import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfAnnotation;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfFormField;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPCellEvent;
import com.itextpdf.text.pdf.PdfWriter;

public class FormFieldCellEvent implements PdfPCellEvent {
    private PdfFormField formField;

    public FormFieldCellEvent(PdfFormField formField) {
        this.formField = formField;
    }

    @Override
    public void cellLayout(PdfPCell cell, Rectangle position, PdfContentByte[] canvases) {
        PdfWriter writer = canvases[0].getPdfWriter();
        formField.setWidget(position, PdfAnnotation.HIGHLIGHT_INVERT);
        writer.addAnnotation(formField);
    }

}
