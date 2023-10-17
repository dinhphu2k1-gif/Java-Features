package org.example;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    List<Invoice> invoices = new ArrayList<>();

    private class Invoice {
        private String title;

        public String getTitle() {
            return title;
        }
    }

    private void before() {
        List<Invoice> trainingInvoices = new ArrayList<>();
        for(Invoice inv: invoices) {
            if(inv.getTitle().contains("Training")) {
                trainingInvoices.add(inv);
            }
        }
    }

    private void after() {
        List<Invoice> invoiceIds =
                invoices.stream()
                        .filter(inv -> inv.getTitle().contains("Training"))
                        .collect(Collectors.toList());
    }

    private void parallelStream() {
        List<Invoice> invoiceIds =
                invoices.parallelStream()
                        .filter(inv -> inv.getTitle().contains("Training"))
                        .collect(Collectors.toList());
    }
}
