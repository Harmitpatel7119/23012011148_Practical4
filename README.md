# Practical-4: Alarm Application using Foreground Service (Kotlin)

##  AIM
Create an Android application that sets alarms using **Service** and **BroadcastReceiver**, and triggers a **Foreground Service** when the alarm time is reached.

---

##  DESCRIPTION

This Android app allows users to **set an alarm** at a chosen time.  
When the alarm rings, a **Foreground Service** starts which:

- Shows a **high-priority ongoing notification**
- Plays a **looping alarm sound** using MediaPlayer
- Keeps running until the user manually stops it

This practical demonstrates:

- `AlarmManager`
- `BroadcastReceiver`
- `ForegroundService`
- `NotificationChannel`
- `PendingIntent`
- `MediaPlayer`
- Runtime permissions

---

##  FEATURES / WHAT YOU CAN DO

✔ Choose time using **TimePicker**  
✔ See selected alarm time displayed  
✔ Start an alarm using **Create Alarm** button  
✔ Stop/cancel alarm anytime  
✔ Foreground service plays ringtone until stopped  
✔ Notification stays visible while alarm is active

---

##  HIGH-LEVEL APP FLOW

### **MainActivity**
- Opens TimePicker dialog  
- Schedules exact alarm via **AlarmManager**  
- Creates a **PendingIntent**  
- Sends broadcast at the alarm time

### **AlarmBroadcastReceiver**
- Receives broadcast when alarm triggers  
- Starts **ForegroundService** using:  
  `startForegroundService()` (Android O+)  
- Ensures safe communication between components

### **AlarmService (Foreground Service)**
- Runs in foreground with **persistent notification**  
- Plays alarm tone in loop  
- Stops tone when alarm is cancelled  
- Uses NotificationChannel for Android O+

---

##  PERMISSIONS REQUIRED

### In manifest:
- `SCHEDULE_EXACT_ALARM` → For exact alarms (Android 12+)  
- `POST_NOTIFICATIONS` → Required for notifications (Android 13+)  
- `WAKE_LOCK` (optional) → Keeps CPU active  

### Notes:
- Android 12+ → User may need to manually enable *Exact Alarms*  
- Android 13+ → Notification permission required at runtime  

---

#  OUTPUT

### **Screenshot 1**
![output3](https://drive.google.com/uc?export=view&id=1L_bsFGaNXe6cqxWLUrL27AEATOTIgLYJ)


### **Screenshot 2**
![output2](https://drive.google.com/uc?export=view&id=1AUY8rjwyVAh5IgVtygZZ-gfDGXdLT8SA)

### **Screenshot 3**
![output1](https://drive.google.com/uc?export=view&id=1k9N_bfvD9N-oQAIq0nW6dN7CqJQrV_Ff)

---

##  SUMMARY

This practical demonstrates a complete implementation of:

- Alarms  
- Foreground Service  
- Broadcast Receivers  
- Media Playback  
- Notification Handling  
- TimePicker & PendingIntent  
- Android 12+ Exact Alarm behavior  
- Android 13+ Notification permission  

A fully functional alarm system using modern Android components.

