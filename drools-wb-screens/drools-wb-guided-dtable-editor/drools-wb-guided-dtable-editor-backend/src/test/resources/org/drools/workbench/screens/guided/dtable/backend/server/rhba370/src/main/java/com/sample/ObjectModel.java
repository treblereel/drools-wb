package com.sample;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ObjectModel implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String userCode;
   private java.lang.String name;
   private java.lang.String status;

   public ObjectModel()
   {
   }

   public java.lang.String getUserCode()
   {
      return this.userCode;
   }

   public void setUserCode(java.lang.String userCode)
   {
      this.userCode = userCode;
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.lang.String getStatus()
   {
      return this.status;
   }

   public void setStatus(java.lang.String status)
   {
      this.status = status;
   }

   public ObjectModel(java.lang.String userCode, java.lang.String name,
         java.lang.String status)
   {
      this.userCode = userCode;
      this.name = name;
      this.status = status;
   }

}