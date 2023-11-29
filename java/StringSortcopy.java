
public class StringSortcopy {

	private StringSortcopy() {
	}

	private static int partition(String[] targetArray, int left, int right) {
		int i = left - 1;
		int j = right;
		String pivot = targetArray[right];
		while (true) {
			while (targetArray[++i].compareTo(pivot) < 0)
				;
			while (i < --j && pivot.compareTo(targetArray[j]) < 0)
				;
			if (i >= j)
				break;
			String temp = targetArray[i];
			targetArray[i] = targetArray[j];
			targetArray[j] = temp;
		}
		String temp = targetArray[i];
		targetArray[i] = targetArray[right];
		targetArray[right] = temp;
		return i;
	}

	private static void recQuickSort(String[] targetArray, int left, int right) {
		if (left >= right)
			return;
		int v = partition(targetArray, left, right);
		recQuickSort(targetArray, left, v - 1);
		recQuickSort(targetArray, v + 1, right);
	}

	public static void quickSort(String[] targetArray) {
		recQuickSort(targetArray, 0, targetArray.length - 1);
	}
}
