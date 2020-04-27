class heap{
    int[] heap;
    int tail;
    public heap(int capacidade){
        this.heap = new int[capacidade];
        this.tail = -1;
    }
    public boolean isEmpty(){return this.tail == -1;}

    public boolean isFull(){return this.tail == heap.length -1;}

    public void add(int valor){
        if(!isFull()){
            this.tail++;
            this.heap[this.tail] = valor;
            int i = this.tail;
            while(getPai(i) != -1 && this.heap[getPai(i)] < valor){
                swap(this.heap, i, getPai(i));
                i = getPai(i);
            }
        }
    }
    public int remove (int valor){
        if(isEmpty()){
            return -1;
        }else{
            int aux = heap[0];
            swap(this.heap, 0, this.tail);
            this.tail --;
            heapFy(0);    
            return aux;
        }
    }
    public void heapFy(int indice){
        if(indice >= 0 && indice <= getPai(this.tail)){
            int maior = indice;
            if(getDireita(indice) != -1 && this.heap[getDireita(indice)] > this.heap[indice]){
                maior = getDireita(indice);
            }if(this.heap[getEsquerda(indice)] > this.heap[maior]){
                maior = getEsquerda(indice);
            }if(maior != indice){
                swap(heap, maior, indice);
                heapFy(maior);
            }
        }
    }
    
    private int getPai(int indice){
        if(indice == 0 || indice >= heap.length){
            return -1;
        }else{
            return (indice - 1 )/ 2;
        }
    }
    private int getEsquerda(int indice){
        int esquerda = (2 * indice) + 1;
        if(esquerda > this.tail){
            return -1;
        }else{
            return esquerda;
        }
    }
    private int getDireita(int indice){
        int direita = (2 * indice) + 2;
        if(direita > this.tail){
            return -1;
        }else {
            return direita;
        }
    }
    private void swap(int[] array, int i, int j){
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }

}