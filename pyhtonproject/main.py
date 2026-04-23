import sqlite3
import os
from dao.student_dao import StudentDAO

# ---------------- CREATE DATABASE & TABLE ----------------
def create_table():
    BASE_DIR = os.path.dirname(os.path.abspath(__file__))
    DB_DIR = os.path.join(BASE_DIR, "database")
    DB_PATH = os.path.join(DB_DIR, "students.db")

    os.makedirs(DB_DIR, exist_ok=True)

    conn = sqlite3.connect(DB_PATH)
    cursor = conn.cursor()
    cursor.execute("""
        CREATE TABLE IF NOT EXISTS students (
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            name TEXT NOT NULL,
            course TEXT NOT NULL,
            marks INTEGER NOT NULL
        )
    """)
    conn.commit()
    conn.close()

# ---------------- MAIN FUNCTION ----------------
def main():
    create_table()
    dao = StudentDAO()

    while True:
        print("\n===== STUDENT MANAGEMENT SYSTEM =====")
        print("1. Add Student")
        print("2. View Students")
        print("3. Update Student")
        print("4. Delete Student")
        print("5. Exit")

        choice = input("Enter your choice: ")

        if choice == '1':
            name = input("Enter Name: ")
            course = input("Enter Course: ")
            marks = int(input("Enter Marks: "))
            dao.add_student(name, course, marks)
            print("✅ Student Added Successfully")

        elif choice == '2':
            students = dao.view_students()
            print("\n--- Student Records ---")
            for s in students:
                print(f"ID:{s[0]}  Name:{s[1]}  Course:{s[2]}  Marks:{s[3]}")

        elif choice == '3':
            sid = int(input("Enter Student ID: "))
            marks = int(input("Enter New Marks: "))
            dao.update_student(sid, marks)
            print("✅ Student Updated")

        elif choice == '4':
            sid = int(input("Enter Student ID: "))
            dao.delete_student(sid)
            print("❌ Student Deleted")

        elif choice == '5':
            print("Exiting Program...")
            break

        else:
            print("❌ Invalid Choice")

if __name__ == "__main__":
    main()
