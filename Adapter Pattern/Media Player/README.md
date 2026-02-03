# Media Player Adapter Pattern Problem

## **Problem Statement**
You are developing a media player application that currently only supports playing **MP3** audio files. The existing system has an `AudioPlayer` interface that works perfectly with MP3 files. However, you need to extend the system to support new media formats that have emerged in the market.

## **Existing System**:
- **AudioPlayer Interface**: Has a method `playAudio(String audioType, String fileName)`
- **MP3Player Class**: Implements `AudioPlayer` and can play MP3 files
- **MediaPlayer Application**: Uses the `AudioPlayer` interface to play media files

## **New Requirements**:
Your application needs to support additional media formats:
1. **MP4 Files**: Video files that require both audio and video playback
2. **VLC Files**: Advanced media format with its own playback logic

## **The Challenge**:
The new media formats (MP4 and VLC) have completely different interfaces:
- **AdvancedMediaPlayer Interface**:
    - `playMp4(String fileName)` - for MP4 files
    - `playVlc(String fileName)` - for VLC files

You cannot modify the existing `AudioPlayer` interface or the `MP3Player` class as they are being used by multiple applications. You also cannot modify the `AdvancedMediaPlayer` interface as it's provided by a third-party library.

## **Requirements**:

1. **Maintain Compatibility**: The existing `AudioPlayer` interface must remain unchanged
2. **Extend Functionality**: Add support for MP4 and VLC formats
3. **Adapt Different Interfaces**: Bridge the gap between `AudioPlayer` and `AdvancedMediaPlayer`
4. **Client Transparency**: The main application should use the same method to play all formats

## **Format Support Specifications**:

| Format | Extension | Type | Requirements |
|--------|-----------|------|--------------|
| MP3    | .mp3      | Audio | Plays directly |
| MP4    | .mp4      | Video | Needs video playback capability |
| VLC    | .vlc      | Media | Needs special media handling |

## **Design Constraints**:

1. **Do not modify** the existing `AudioPlayer` interface or `MP3Player` class
2. **Do not modify** the `AdvancedMediaPlayer` interface from the third-party library
3. **Use Adapter Pattern** to make incompatible interfaces work together
4. **The client code** should be able to play any format using the same method call
5. **Error Handling**: If an unsupported format is requested, display appropriate message

## **Expected Behavior**:

```
Client requests: play("song.mp3") → MP3Player plays audio
Client requests: play("movie.mp4") → MP4 adapter plays video with audio
Client requests: play("presentation.vlc") → VLC adapter plays media
Client requests: play("image.jpg") → Error: Invalid media format
```

## **Your Task**:

Design and implement a solution using the **Adapter Pattern** that allows the existing audio player system to support MP4 and VLC formats without breaking existing functionality.

## **Deliverables**:
1. Class diagram showing the adapter pattern structure
2. Implementation of all necessary classes
3. Demonstration that all formats can be played through the same interface
4. Show how the adapter pattern helps maintain the Open/Closed Principle



