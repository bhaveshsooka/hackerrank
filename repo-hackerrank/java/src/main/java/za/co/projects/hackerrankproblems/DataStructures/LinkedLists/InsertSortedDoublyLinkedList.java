package DataStructures.LinkedLists;

public class InsertSortedDoublyLinkedList
{
	Node SortedInsert(Node head, int data)
	{
		if (head == null)
		{
			Node node = new Node();
			node.data = data;
			return node;
		}
		Node node = head;
		while (node != null)
		{
			if (node.data >= data)
			{
				Node i = new Node();
				i.data = data;
				i.prev = node.prev;
				i.next = node;
				node.prev = i;
				if (i.prev == null)
				{
					return i;
				}
				else
				{
					i.prev.next = i;
					return head;
				}
			}
			if (node.next == null)
			{
				Node i = new Node();
				i.data = data;
				i.prev = node;
				i.next = null;
				node.next = i;
				break;
			}
			node = node.next;
		}
		return head;
	}
}
