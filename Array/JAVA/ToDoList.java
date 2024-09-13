                        import java.util.ArrayList;
                        import java.util.LinkedList;
                        import java.util.Scanner;
                        import java.util.Random;

                        public class ToDoList {
                            private LinkedList<String> linkedListTasks;
                            private ArrayList<String> arrayTasks;
                             private static final int NUM_TASKS = 10000; // Number of tasks to generate


                            public ToDoList() {
                                linkedListTasks = new LinkedList<>();
                                arrayTasks = new ArrayList<>();
                                populateTasks(); // Populate both lists with tasks
                            }

                            private void populateTasks() {
                                Random random = new Random();
                                for (int i = 0; i < NUM_TASKS; i++) {
                                    String task = "Task " + i; // Simple task description
                                    linkedListTasks.add(task);
                                    arrayTasks.add(task);
                                }
                            }

                            // --- Linked List Methods ---
                            public void addTaskLinkedList() {
                                long startTime = System.nanoTime(); // Start timer
                                Scanner scanner = new Scanner(System.in);
                                System.out.print("Enter task description: ");
                                String task = scanner.nextLine();
                                linkedListTasks.add(task);
                                long endTime = System.nanoTime(); // End timer
                                System.out.println("Task added: " + task);
                                System.out.println("Time taken (Linked List): " + (endTime - startTime) / 1000000 + " ms"); 
                            }

                            public void viewTasksLinkedList() {
                                long startTime = System.nanoTime(); // Start timer
                                if (linkedListTasks.isEmpty()) {
                                    System.out.println("No tasks yet!");
                                } else {
                                    System.out.println("To-Do List (Linked List):");
                                    for (int i = 0; i < linkedListTasks.size(); i++) {
                                        System.out.println((i + 1) + ". " + linkedListTasks.get(i));
                                    }
                                }
                                long endTime = System.nanoTime(); // End timer
                                System.out.println("Time taken (Linked List): " + (endTime - startTime) / 1000000 + " ms"); 
                            }

                            public void markCompletedLinkedList() {
                                long startTime = System.nanoTime(); // Start timer
                                viewTasksLinkedList();
                                if (!linkedListTasks.isEmpty()) {
                                    Scanner scanner = new Scanner(System.in);
                                    System.out.print("Enter task number to mark as completed: ");
                                    int taskNumber = scanner.nextInt();
                                    if (taskNumber >= 1 && taskNumber <= linkedListTasks.size()) {
                                        linkedListTasks.remove(taskNumber - 1);
                                        System.out.println("Task marked as completed.");
                                    } else {
                                        System.out.println("Invalid task number.");
                                    }
                                }
                                long endTime = System.nanoTime(); // End timer
                                System.out.println("Time taken (Linked List): " + (endTime - startTime) / 1000000 + " ms"); 
                            }

                            // --- Array Methods ---
                            public void addTaskArray() {
                                long startTime = System.nanoTime(); // Start timer
                                Scanner scanner = new Scanner(System.in);
                                System.out.print("Enter task description: ");
                                String task = scanner.nextLine();
                                arrayTasks.add(task);
                                long endTime = System.nanoTime(); // End timer
                                System.out.println("Task added: " + task);
                                System.out.println("Time taken (Array): " + (endTime - startTime) / 1000000 + " ms"); 
                            }

                            public void viewTasksArray() {
                                long startTime = System.nanoTime(); // Start timer
                                if (arrayTasks.isEmpty()) {
                                    System.out.println("No tasks yet!");
                                } else {
                                    System.out.println("To-Do List (Array):");
                                    for (int i = 0; i < arrayTasks.size(); i++) {
                                        System.out.println((i + 1) + ". " + arrayTasks.get(i));
                                    }
                                }
                                long endTime = System.nanoTime(); // End timer
                                System.out.println("Time taken (Array): " + (endTime - startTime) / 1000000 + " ms"); 
                            }

                            public void markCompletedArray() {
                                long startTime = System.nanoTime(); // Start timer
                                viewTasksArray();
                                if (!arrayTasks.isEmpty()) {
                                    Scanner scanner = new Scanner(System.in);
                                    System.out.print("Enter task number to mark as completed: ");
                                    int taskNumber = scanner.nextInt();
                                    if (taskNumber >= 1 && taskNumber <= arrayTasks.size()) {
                                        arrayTasks.remove(taskNumber - 1); 
                                        System.out.println("Task marked as completed.");
                                    } else {
                                        System.out.println("Invalid task number.");
                                    }
                                }
                                long endTime = System.nanoTime(); // End timer
                                System.out.println("Time taken (Array): " + (endTime - startTime) / 1000000 + " ms"); 
                            }

                            public static void main(String[] args) {
                                ToDoList toDoList = new ToDoList();
                                Scanner scanner = new Scanner(System.in);

                                while (true) {
                                    System.out.println("\nTo-Do List Menu:");
                                    System.out.println("1. Choose Linked List");
                                    System.out.println("2. Choose Array");
                                    System.out.println("3. Exit");
                                    System.out.print("Enter your choice: ");

                                    int choice = scanner.nextInt();
                                    scanner.nextLine(); // Consume newline character

                                    switch (choice) {
                                        case 1:
                                            System.out.println("\nLinked List Mode:");
                                            while (true) {
                                                System.out.println("\nTo-Do List (Linked List) Menu:");
                                                System.out.println("1. Add Task");
                                                System.out.println("2. View Tasks");
                                                System.out.println("3. Mark as Completed");
                                                System.out.println("4. Back to Main Menu");
                                                System.out.print("Enter your choice: ");

                                                int linkedListChoice = scanner.nextInt();
                                                scanner.nextLine(); 

                                                switch (linkedListChoice) {
                                                    case 1:
                                                        toDoList.addTaskLinkedList();
                                                        break;
                                                    case 2:
                                                        toDoList.viewTasksLinkedList();
                                                        break;
                                                    case 3:
                                                        toDoList.markCompletedLinkedList();
                                                        break;
                                                    case 4:
                                                        break; // Go back to main menu
                                                    default:
                                                        System.out.println("Invalid choice.");
                                                }
                                                if (linkedListChoice == 4) {
                                                    break; 
                                                }
                                            }
                                            break;

                                        case 2:
                                            System.out.println("\nArray Mode:");
                                            while (true) {
                                                System.out.println("\nTo-Do List (Array) Menu:");
                                                System.out.println("1. Add Task");
                                                System.out.println("2. View Tasks");
                                                System.out.println("3. Mark as Completed");
                                                System.out.println("4. Back to Main Menu");
                                                System.out.print("Enter your choice: ");

                                                int arrayChoice = scanner.nextInt();
                                                scanner.nextLine();

                                                switch (arrayChoice) {
                                                    case 1:
                                                        toDoList.addTaskArray();
                                                        break;
                                                    case 2:
                                                        toDoList.viewTasksArray();
                                                        break;
                                                    case 3:
                                                        toDoList.markCompletedArray();
                                                        break;
                                                    case 4:
                                                        break; // Go back to main menu
                                                    default:
                                                        System.out.println("Invalid choice.");
                                                }
                                                if (arrayChoice == 4) {
                                                    break; 
                                                }
                                            }
                                            break;
                                        case 3:
                                            System.out.println("Exiting...");
                                            System.exit(0);
                                        default:
                                            System.out.println("Invalid choice.");
                                    }
                                }
                            }
                        }