package java_tutorial.collection.array;

import java.util.Arrays;

public class MyArrayListV4<E> {

  private static final int DEFAULT_CAPACITY = 5;

  private Object[] elementData;
  private int size = 0;

  public MyArrayListV4() {
    this.elementData = new Object[DEFAULT_CAPACITY];
  }

  public MyArrayListV4(int initialCapacity) {
    this.elementData = new Object[initialCapacity];
  }

  public int size() {
    return size;
  }

  public void add(E e) {
    if (size == elementData.length) {
      grow();
    }
    elementData[size] = e;
    size++;
  }

  // 코드 추가
  public void add(int index, E e) {
    if (size == elementData.length) {
      grow();
    }
    // 데이터 이동
    shiftRightFrom(index);
    elementData[index] = e;
    size++;
  }

  private void shiftRightFrom(int index) {
    for (int i = size; i > index; i--) {
      elementData[i] = elementData[i - 1];
    }
  }

  private void grow() {
    int oldCapacity = elementData.length;
    int newCapacity = oldCapacity * 2;
    elementData = Arrays.copyOf(elementData, newCapacity);
  }

  @SuppressWarnings("unchecked")
  public E get(int index) {
    return (E) elementData[index];
  }

  public E set(int index, Object element) {
    E oldValue = get(index);
    elementData[index] = element;
    return oldValue;
  }

  // 코드 추가
  public E remove(int index) {
    E oldValue = get(index);
    // 데이터 이동
    shiftLeftFrom(index);
    size--;
    elementData[size] = null;
    return oldValue;
  }

  // 코드 추가 index부터 마지막까지 왼쪽으로 밀기
  private void shiftLeftFrom(int index) {
    for (int i = index; i < size - 1; i++) {
      elementData[i] = elementData[i + 1];
    }
  }

  public int indexOf(E o) {
    for (int i = 0; i < size; i++) {
      if (o.equals(elementData[i])) {
        return i;
      }
    }
    return -1;
  }

  public String toString() {
    return Arrays.toString(Arrays.copyOf(elementData, size))
        + " size="
        + size
        + ", capacity"
        + elementData.length;
  }
}
