import sqlite3
import os
from dao.student_interface import StudentInterface

class StudentDAO(StudentInterface):

    def connect_db(self):
        BASE_DIR = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
        DB_PATH = os.path.join(BASE_DIR, "database", "students.db")
        return sqlite3.connect(DB_PATH)

    def add_student(self, name, course, marks):
        conn = self.connect_db()
        cursor = conn.cursor()
        cursor.execute(
            "INSERT INTO students (name, course, marks) VALUES (?, ?, ?)",
            (name, course, marks)
        )
        conn.commit()
        conn.close()

    def view_students(self):
        conn = self.connect_db()
        cursor = conn.cursor()
        cursor.execute("SELECT * FROM students")
        data = cursor.fetchall()
        conn.close()
        return data

    def update_student(self, student_id, marks):
        conn = self.connect_db()
        cursor = conn.cursor()
        cursor.execute(
            "UPDATE students SET marks=? WHERE id=?",
            (marks, student_id)
        )
        conn.commit()
        conn.close()

    def delete_student(self, student_id):
        conn = self.connect_db()
        cursor = conn.cursor()
        cursor.execute(
            "DELETE FROM students WHERE id=?",
            (student_id,)
        )
        conn.commit()
        conn.close()
