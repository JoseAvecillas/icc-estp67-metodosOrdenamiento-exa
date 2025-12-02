package controllers;

import models.Brand;

public class BrandController {

    public Brand[] sortSelectionAsc(Brand[] brands) {
        int brand = brands.length;
        for (int i = 0; i < brand - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < brand; j++) {
                if (brands[j].getTotalValidYears() < brands[minIndex].getTotalValidYears()) {
                    minIndex = j;
                }
            }
            Brand temp = brands[i];
            brands[i] = brands[minIndex];
            brands[minIndex] = temp;
        }
        return brands;
    }


    public Brand binarySearchByValidYears(Brand[] brands, int validYears, boolean isAscending) {
        int left = 0;
        int right = brands.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = brands[mid].getTotalValidYears();
            if (midValue == validYears) {
                return brands[mid]; 
            }
            if (isAscending) {
                if (midValue < validYears) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (midValue > validYears) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return null;
    }
}