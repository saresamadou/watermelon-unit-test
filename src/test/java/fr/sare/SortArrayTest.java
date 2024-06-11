package fr.sare;

import org.junit.jupiter.api.Test;

import static fr.sare.SortArray.isSortedInAscendantOrder;

public class SortArrayTest {

    @Test
    void shouldReturnTrueWhenArrayIsSortedInAscendantOrder() {
        int[] array = {1, 2, 3, 4, 5};

        isSortedInAscendantOrder(array);
    }



    @Test
    void shouldReturnTrueWhenArrayIsNotSortedInAscendantOrder() {
        int[] array = {5, 4, 3, 2, 1};

        isSortedInAscendantOrder(array);
    }

}
