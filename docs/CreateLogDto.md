
# CreateLogDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subtype** | [**SubtypeEnum**](#SubtypeEnum) | What kind of log is it? | 
**origin** | [**OriginEnum**](#OriginEnum) | Where did the log come from? | 
**title** | **String** | describes the log in short | 
**text** | **String** | describes the log in depth | 
**attachments** | **List&lt;String&gt;** | Attachments of this log | 
**runs** | **List&lt;String&gt;** | Attached run numbers of this log | 


<a name="SubtypeEnum"></a>
## Enum: SubtypeEnum
Name | Value
---- | -----
RUN | &quot;run&quot;
SUBSYSTEM | &quot;subsystem&quot;
ANNOUNCEMENT | &quot;announcement&quot;
INTERVENTION | &quot;intervention&quot;
COMMENT | &quot;comment&quot;


<a name="OriginEnum"></a>
## Enum: OriginEnum
Name | Value
---- | -----
HUMAN | &quot;human&quot;
PROCESS | &quot;process&quot;



